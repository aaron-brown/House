package com.rackspace

class House
{
    // Standard data
    Date dateCreated
    Date dateUpdated
    
    // Data pertaining to House
    String street
    String city
    String state
    Integer zipcode
    String familyName
    Integer occupants
    
    // Relational data
    Room room

    static constraints =
    {
        street(blank: false, size: 1..31)
        city(blank: false, size: 1..31)
        state(blank: false, size: 1..15)
        zipcode(blank: false, size: 5)
        familyName(blank: false, size: 1..31)
        occupants(nullable: true)
        room(nullable: true)
    }
    
    static mapping =
    {
        room(lazy:false)
    }
}
