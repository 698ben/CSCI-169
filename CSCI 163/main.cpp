#include <iostream>
#include <stack>
//#include <std::vector>;
//#include "Node.h"

using namespace std;

struct node
{
  string data;
  node* next;
  node* real;

};

bool bipartite(node arr[])
{
  stack<node> stack;
  stack.push(arr[0]);
  node current = {"",nullptr};
  while(stack.size() != 0)
  {
    current = stack.top();
    stack.pop();
    node* child = current.next;
    while(child != nullptr)
    {
      stack.push(*child);
      if(child -> data == "")
      {
        if (current.data == "blue")
        {
          child -> real -> data = "red";
        }else
        {
          child -> real -> data = "blue";
        }
      }else
      {
        if(child -> real -> data == current.data)
        {
          return false;
        }
      }
      child = child -> next;
    }
  }
  return true;


}


int main()
{
  node vetecies[] = {node{"",nullptr,nullptr},node{"",nullptr,nullptr},node{"", nullptr,nullptr},node{"",nullptr,nullptr}};

  vetecies[0].next = new node(vetecies[1]);
  vetecies[0].next -> real = &vetecies[1];
  vetecies[0].next -> next = new node(vetecies[2]);
  vetecies[0].next -> next -> real = &vetecies[2];

  vetecies[1].next = new node(vetecies[0]);
  vetecies[1].next -> real = &vetecies[0];
  vetecies[1].next -> next = new node(vetecies[2]);
  vetecies[1].next -> next -> real = &vetecies[2];
  vetecies[1].next -> next -> next = new node(vetecies[3]);
  vetecies[1].next -> next -> next -> real = &vetecies[3];

  vetecies[2].next = new node(vetecies[0]);
  vetecies[2].next -> real = &vetecies[0];
  vetecies[2].next -> next = new node(vetecies[3]);
  vetecies[1].next -> next -> real = &vetecies[3];
  vetecies[2].next -> next = new node(vetecies[1]);
  vetecies[1].next -> next -> next -> real = &vetecies[1];

  vetecies[3].next = new node(vetecies[1]);
  vetecies[2].next -> real= &vetecies[1];
  vetecies[3].next -> next = new node(vetecies[2]);
  vetecies[2].next -> next -> real = &vetecies[1];

  // if(bipartite(vetecies))
  //   cout << "Hello" << endl;
  cout << bipartite(vetecies) << endl;
  return 0;
}