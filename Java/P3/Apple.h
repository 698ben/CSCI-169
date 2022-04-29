#ifndef Apple_h
#define Apple_h

#include "Fruit.h"

class Apple: public Fruit {
  public: 
    Apple():Fruit(nullptr,"Apple"){}
    Apple(time_t* date):Fruit(date,"Apple"){}
    void prepare()
    {
      std::cout << "Core the apple" << std::endl;
    }
};

#endif