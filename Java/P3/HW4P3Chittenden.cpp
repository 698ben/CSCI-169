#include "Tomato.h"

using namespace std;

int main()
{
  time_t time = 1200000000;
  time_t time1 = 3400;//new time_t(3400);
  Tomato t = Tomato();
  Tomato t2 = Tomato(&time,&time,"hot house");
  t.prepare();
  t2.ripeTime();
  return 0;
}