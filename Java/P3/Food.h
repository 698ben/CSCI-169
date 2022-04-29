#ifndef Food_h
#define Food_h

#include <iostream>
#include <ctime>

class Food {
  public: 
    std::string name;
  
  Food()
  {
    name = "";
    std::cout << "food constructor called" << std::endl;
  }
  Food(std::string n)
  {
    name = n;
    std::cout << "food non default constructor called" << std::endl;
  }
  void prepare()
  {
    std::cout << "Prepare the " + name << std::endl;
  }
};

#endif