//memento example

#include <iostream>;
using namespace std;

class Memento;

class Originator{
	int x;

public:
	Memento *createMemento();
	void setMemento(Memento *m);
	void changeState(intx);
	Originator(int x);
	void Display(){
		cout<<x<<endl;
	};
};

class Memento {
	friend class Originator;
	void setState(int x){
		this->x= x;
	}
	int getState(){
		return x;
	}

	int x;
public:
	Memento();
};



Originator::Originator(int x){
	this->x = x;
}

void Originator::setMemento(Memento *x){
	this->x = m.getState();
}

void Originator:: changeState(int x){
	this->x = x;
}
Memento* Originator::createMemento(){
	Memento *m::createMemento();
	m->setState(this->x);
	return m;
}


int main(){ //caretaker
	Originator org(1);
	Memento *memento = org.createMemento();
	org.Display(); //1
	org.changeState(3);
	org.Display();//3
	//somthign goes whacky with org
	//so we something
	org.setMemento(memento);
	org.Display(); //origninator back to 1
	delete memento;
	return 0;
}