#include<iostream>
using namespace std;
int main()
{
   float mileage;
  int petrol,distance,result;
  std::cin>>mileage;
  std::cin>>petrol;
  std::cin>>distance;
  result=mileage*petrol;
  
  if(result<distance || result==distance)
    std::cout<<"Cannot reach";
    else
      std::cout<<"Can reach";
  
}