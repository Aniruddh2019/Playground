#include<iostream>
using namespace std;
int main()
{
  int profit,w,x,y;
  std::cin>>w;
  std::cin>>x;
  std::cin>>y;
  profit=w*x-(100+w*y);
  std::cout<<profit;
}