#include<iostream>
#include<string>

using namespace std;

class Beverage{
protected:
	string desc;
public:
	Beverage(){
		desc = "unknown Beverage";
	}
	virtual string getDesc(){
		return desc;
	}
	virtual double cost(){
		return 0;
	}
};

class CondimentDecorator : public Decorator{
public:
};

class Expresso : public Beverage{
public:
	Expresso(){
		desc = "Expresso";

	double cost(){
		return 1.99;
	}
};

class Houseblend : public Beverage{
public:
	Houseblend(){
		desc = "Houseblend";
	}

	double cost(){
		return .99;
	}
};



class Mocha : public CondimentDecorator{
	Beverage *bev;
	public:
		Mocha(Beverage *b){
			b = bev;
		}

		String getDesc(){
			return bev->getDesc() + ", Mocha";
		}
		double cost(){
			return bev->cost() + .20;
		}
};

class Whip: public CondimentDecorator{
	Beverage *bev;
public:
	Whip(Beverage *b){
		bev = b;
	}
	string getDesc(){
		return bev->getDesc() + ", Whip";
	}
	double cost(){
		return .15 + bev->cost();
	}
};


int int main(int argc, char const *argv[])		//Client
{
	Beverage *bev = new Expresso();

	cout<<bev->getDesc() << "   $" << bev->cost();	//Expresso   $1.99 
	
	bev = new Whip(bev);
	cout<<bev->getDesc() << "   $" << bev->cost();	//Expresso, Whip   $2.14

	bev = new Mocha(bev);
	cout<<bev->getDesc() << "   $" << bev->cost(); //Expresso, Whip, Mocha   $2.34

	bev = new Whip(bev)
	cout<<bev->getDesc() << "   $" << bev->cost();	//Expresso, Whip, Mocha, Whip   $2.49

	// if we delete bev, we are only deleting the most recent pointer. all the older pointer are always theres in the heap somewhere


	return 0;
}

