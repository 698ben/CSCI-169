#ifndef Orange_h
#define Orange_h

#include "Fruit.h"



class Orange:public Fruit {
  public: 
    Orange(): Fruit(nullptr,"Orange"){}
    Orange(time_t* date): Fruit(date,"Orange"){}
  void prepare()
  {
    std::cout << "Peel the orange" << std::endl;
  }
};

#endif