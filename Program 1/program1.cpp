//Program1
#include <iostream>
#include <stdio.h>
#include <fstream>

using namespace std;


class Employee{
protected:
	char EmpID[12];
	char  DeptID[5];
	double netpay;
public:	
	void readIDs(ifstream& inputFile){
		inputFile >> EmpID >> DeptID;
	}

	virtual void readInputFromFile(ifstream&){};
	virtual void netpayCalculator(){};
	virtual void output(){};
};


class Salaried: public Employee{
public:
	double salary;
	void readInputFromFile(ifstream& inputFile){
		readIDs(inputFile);
		inputFile >> salary;
	};

	void netpayCalculator(){
		netpay = salary/12;
	};

	void output(){
		cout << "Employee #"<<EmpID << " " <<"DeptID #" << DeptID << " " << "Net Pay: $" <<netpay << " " << "Salary: $" << salary <<endl;
	};
};


class Hourly: public Employee{
public:
	double rate, hours;
	void readInputFromFile(ifstream& inputFile){
		readIDs(inputFile);
		inputFile >> hours >> rate;
	};

	void netpayCalculator(){
		if(hours>40){
			double  overtime = hours - 40;
			netpay = (overtime*1.5*rate) + (hours-overtime)*rate;
		}
		else
			netpay = hours*rate;
	};

	void output(){
		cout << "Employee #"<<EmpID << " " <<"DeptID #" << DeptID << " " << "Net Pay: $" <<netpay << " " << "Hours:" << hours << " " << "Rate:$" << rate << endl;
	};
};


class Commissioned: public Employee{
	double sales;
	void readInputFromFile(ifstream& inputFile){
		readIDs(inputFile);
		inputFile >> sales;
	};

	void netpayCalculator(){
		if(sales < 15000){
			netpay = 0.12*sales;
		}
		else if(sales >15000 & sales< 25000){
			netpay = (0.12*15000) + 0.15*(sales-15000);
		}
		else if(sales > 25000){
			netpay = (0.12*15000) + (0.15*10000) + 0.20*(sales-25000);
		}
	};

	void output(){
		cout << "Employee #"<<EmpID << " " <<"DeptID #" << DeptID << " " << "Net Pay: $" <<netpay <<" Sales:$" << sales << endl;
	};
};


//funtion to implement factory method
Employee *empType(int objectType){

	if(objectType==1){
		return new Salaried;
	}	
	else if(objectType==2){
		return new Hourly;
	}
	else if(objectType==3){
		return new Commissioned;
	}
	else
		cout<<"Please enter valid employee type 1, 2 or 3";
};


//main function
int main(int argc, char const *argv[])
{
	Employee *emp;
	ifstream inputFile(argv[1]);
	
	if(inputFile.is_open()){
		while(!inputFile.eof()){
			int type;
			inputFile>>type;
			emp = empType(type);
			emp->readInputFromFile(inputFile);
			emp->netpayCalculator();
			emp->output();
		}
		inputFile.close();
	}
	else
		cout << "Cannot Open File"<<endl;
	
	
	return 0;
}



