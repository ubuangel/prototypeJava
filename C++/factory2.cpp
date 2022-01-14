
#include<iostream>
#include<algorithm>
#include<vector>
#include<string>


class Plan{

  protected:
    std::string tipodeSub;


  public:
    Plan(){}
    std::string getTipoSub(){return this->tipodeSub;}//no son metodos son funciones miembro


};
class PlanEstudiantil:public Plan{

public:
  PlanEstudiantil():Plan(){
    tipodeSub="Plan estudiantil";
    std::cout<<"adquirio el plan estudiantil";
  }

};


class planProfesional:public Plan{

public:
  planProfesional():Plan(){
    tipodeSub="Plan Profesional";
    std::cout<<"adquirio el plan Profesional";
  }

};

class planCorporativo:public Plan{
  public:
    planCorporativo():Plan(){
      tipodeSub="Plan corporativo";
      std::cout<<"adquirio el plan corporativo";
    }

};



class planFactori{
  public:
    Plan* getPlan(){
      int opcion=0;
      std::cout<<"Estudianil 1\n";
        std::cout<<"Profesional 2\n";
          std::cout<<"Cooporativo 3\n";
            std::cout<<"Su opcion: \n";
          std::cin>>opcion;

          switch (opcion) {
            case 1  /* value */:
                plan=new PlanEstudiantil;
                break;
            case 2:
                plan=new planProfesional;
                break;
            case 3:
                plan=new planCorporativo;
                break;
            default:
            plan=nullptr;
            break;
          }
          return plan;
    }
  private:
    Plan* plan;
};


int main(){

planFactori planFabrica;
Plan* planselecionado;

planselecionado=planFabrica.getPlan();

  if (planselecionado!=nullptr) {
    /* code */std::cout<<planselecionado->getTipoSub()<<"\n";
  }else{

    std::cout<<"el plan no existe";
  }

  return 0;


}
