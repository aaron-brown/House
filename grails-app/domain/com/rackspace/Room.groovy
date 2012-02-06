package com.rackspace

class Room
{
    // Relationship declaration
    static belongsTo = [house : House]
    
    // Standard data
    Date dateCreated
    Date dateUpdated
    
    // Model-specific data
    String roomName
    Integer floor
    String description
    
    static constraints =
    {
        roomName(blank: false, maxSize: 31)
        floor(nullable: true)
        description(blank: true, maxSize: 511)
    }
    
    static mapping =
    {
        sort dateCreated : "desc"
    }
}
