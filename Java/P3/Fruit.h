#ifndef Fruit_h
#define Fruit_h

#include "Food.h"
#include <string>


class Fruit : virtual public Food{
  private:
   time_t* ripe;
  public: 
    Fruit() : Food()
    {
      ripe = new time_t(0);
      std::cout << "fruit constructor called" << std::endl;
    }
    Fruit(time_t* date, std::string name) : Food(name)
    {
      ripe = date;
      std::cout << "fruit constructor called" << std::endl;
    }
    void ripeTime()
    {
      char* date1 = ctime(ripe);
      std::string a = "";
      int i = 0;
      while(*(date1 + i) != '\n')
      {
        a += *(date1 + i);
        i++;
      }

      std::cout << "You can eat it on " << a << std::endl;
    }
    time_t getRipe()
    {
      return *ripe;
    }
};

#endif