There are there class that can help to manipulate data:
No need to care about database manipulation, just call the method in these class. 
 ## 1. /src/dao/maintainDealer
 ####   add a dealer into database. require a dealer class. id and name should not be null. 
    public void addDealer(Dealer d){
      
    }
####   these two function helps to delete a dealer from database, both dealer object and dealer id are ok
    public void delteDealer(Dealer d){
     }
    public void delteDealer(String dealerID){
     }
####   this method helps to modify a dealer infomation. require two dealer object, first old one, second new one.
    public void modifyDealer(Dealer oldInfo, Dealer newInfo){
     }
## 2. /src/dao/maintainSpecial
 ###   please check the comment above in 1. these four methods are basically in same intention. 
     public void addSpecial(Special s){
     }
    public void removeSpecial(Special s){
     }
    public void removeSpecial(String id){
     }
    public void modifySpecial(Special oldSpecial, Special newSpecial){
     }
 ## 3. /src/dao/maintainVehicle
 ###   please check the comment above in 1. these four methods are basically in same intention. 
     public void addVehicle(Vehicle v){
     }
     public void deleteVehicle(Vehicle v){
     }
     public void deleteVehicle(String id){
     }
    public void modifyVehicle(Vehicle oldVehicle, Vehicle newVehicle){
     }
