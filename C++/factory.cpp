//sacado de como pensar c++ volumen 2 pag 272
#include <iostream>
#include <stdexcept>
#include <cstddef>
#include <string>
#include <vector>
#include "purge.h"
using namespace std;




class Shape{

  private:

  public:
    virtual void draw()=0;
    virtual void erase()=0;
    virtual ~Shape(){}

  class BadShapeCreation : public logic_error{
  public:
      BadShapeCreation(string type):logic_error("cannot create type"+type){}

    };
  static Shape* factory(const string& type)
    throw(BadShapeCreation);


};

class Circle : public Shape{
  Circle(){}
  friend class Shape;

  public:
    void draw(){cout<<"Circle::draw"<<endl;}
    void erase(){cout<<"Circle::erase"<<endl;}
     ~Circle(){cout<<"Circle::~Circle"<<endl;}

};

class Square :public Shape{
  Square(){}

  friend class Shape;

  public:
    void draw(){cout<<"Square::draw"<<endl;}
    void erase(){cout<<"Square::erase"<<endl;}

    ~Square() {cout<<"Square::~Square"<<endl; }
  };


  Shape* Shape::factory(const string& type)
    throw(Shape::BadShapeCreation){
      if(type=="Circle")return new Circle;
      if(type=="Square")return new Square;
      throw BadShapeCreation(type);
    }

  char* s1[]={"Circle ","square ","Square","Circle","Circle","Circle","Circle","Square"};



int main(){

  vector<Shape*> shapes;

  try{
    for (size_t i = 0; i < sizeof s1 / sizeof s1[0]; i++) {
      /* code */
      shapes.push_back(Shape::factory(s1[i]));
    }

  }catch(Shape::BadShapeCreation e){
    cout<<e.what()<<endl;
    purge(shapes);
    return EXIT_FAILURE;
  }

  for (size_t i = 0; i < shapes.size(); i++) {
    /* code */
    shapes[i]->draw();
    shapes[i]->erase();
  }

  purge(shapes);




  return 0;


}
