#ifndef Tomato_h
#define Tomato_h

#include "Vegetable.h"
#include "Fruit.h"



class Tomato: public Vegetable,  public Fruit {
  public: 
    Tomato(): Vegetable(nullptr,"Tomato"){ std::cout << "Tomato constructor called" << std::endl; }
    Tomato(time_t* date,time_t* date2, std::string name): Vegetable(date,name), Fruit(date2,name){ std::cout << "Tomato constructor called" << std::endl;}
  void prepare()
  {
    std::cout << "prepare the tomato" << std::endl;
  }
  void ripeTime()
  {
      Fruit::ripeTime();
  }
};

#endif