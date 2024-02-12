package com.connectingMySQL.MySQLdemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Vendors")

public class CloudVendor {
    @Id
    @Column(name="vendorId")
    private String vendorId;
    @Column(name="Name")
    private String Name;
    @Column(name="Address")
    private String Address;
    @Column(name="Phone")
    private String Phone;

    public CloudVendor() {

    }

    public CloudVendor(String vendorId, String Name, String Address, String Phone) {
        this.vendorId = vendorId;
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

}
