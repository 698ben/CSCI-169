#ifndef Vegetable_h
#define Vegetable_h

#include "Food.h"


class Vegetable : virtual public Food{
  private:
   time_t* ripe;
  public: 
    Vegetable() : Food()
    {
      ripe = new time_t(0);
      std::cout << "Vegatble constructor called" << std::endl;
    }
    Vegetable(time_t* date, std::string name) : Food(name)
    {
      ripe = date;
      std::cout << "Vegetable constructor called" << std::endl;
    }
    void ripeTime()
    {
      std::cout << "You can eat it on " << ripe << std::endl;
    }
    time_t* getRipe()
    {
      return ripe;
    }
};

#endif