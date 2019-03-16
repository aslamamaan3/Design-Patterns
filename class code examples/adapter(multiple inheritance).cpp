//class adapter
// using multiple inheritance
#include <iostream>
using namespace std;

class Duck{
public:
	virtual void quack()=0;
	virtual void fly() = 0;

};

class MallardDuck : public Duck{
public:
	void quack(){
		cout<<"quack"<<endl;
	}

	void fly(){
		cout<<"Im flying"<<endl;
	}
};

class Turkey{
public: 
	void gobble(){
		cout<<"gobble"<<endl;
	}

	void fly(){
		cout<<"Im flying a bit"<<endl;
	}
};

void MustHaveDuck(Duck *myDUck){
	cout<<"I love to have my duck say..";
	myDuck->quack();
}

class TurkeyAdapter : public Duck, public Turkey{ //using multiple inheritence
public:
	Turkey(   );

	void quack(){
		gobble();
	}

	void fly(){
		Turkey::fly();
	}
};

int main(int argc, char const *argv[])
{
	MallardDuck *d = new MallardDuck();
	MustHaveDuck(d);

	TUrkey *t = new Turkey();
	cout<<t->gobble();

	Duck *ta = new TurkeyAdapter(    );
	MustHaveDuck(ta);
	return 0;
}

