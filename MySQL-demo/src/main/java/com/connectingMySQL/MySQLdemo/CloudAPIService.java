package com.connectingMySQL.MySQLdemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return new CloudVendor("TXL001", "Jacob Odiko", "P.O.BOX, 319,Sondu ,Kenya", "0728529076");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
       this.cloudVendor=cloudVendor;
       return " Cloud Vendor created successfully";
    }

//    @PutMapping
//    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
//        this.cloudVendor=cloudVendor;
//        return " Cloud Vendor updated successfully";
//    }
//// @DeleteMapping("{vendorId}")
//// public String deleteCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
////    this.cloudVendor=cloudVendor;
////    return " Cloud Vendor deleted successfully";
}
