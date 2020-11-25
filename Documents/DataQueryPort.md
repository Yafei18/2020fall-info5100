these are some methods that can be used for basic querys from DB.
Note that these methods are not the query methods that will be used for interactive. 
I will write one or two class in 'service' package, which is a useable port for multi-filter and sort intention.

#   DealerManager 
```
    // DealerQueryResponse includes List of dealers in current page and total pages.
    DealerQueryResponse searchDealers(int postCode, int lines) throws SQLException;

    DealerQueryResponse searchDealers(String dealerName, String city, int pageNumber) throws SQLException;
```
    

#   VehicleManager 
```
    // return the vehicle Id
    public String saveOrUpdateVehicle(Vehicle vehicle);
    
    // true -> success, false -> fail
    public boolean deleteVehicleById(String vehicleId); 

```
    
#   SpecialManager 
```

```
