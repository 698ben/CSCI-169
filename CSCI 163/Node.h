#ifndef Node_h
#define Node_h

class node
{
  private:
    node* next;
    string data;
  public:
    node()
    {
      next = nullptr;
      data = "";
    }
    node(node* h, string d)
    {
      next = h;
      data = d;
    }
    node(string d)
    {
      next = nullptr;
      data = d;
    }
    node(node* h)
    {
      next = h;
      data = "";
    }
    void setNext(node* h)
    {
      next = h;
    }

};

#endif