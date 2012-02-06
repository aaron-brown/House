package com.rackspace

class Room
{
    Date dateCreated
    Date dateUpdated
    String roomName
    Integer floor
    String description
    
    static constraints =
    {
        roomName(blank: false, maxSize: 31)
        floor(nullable: true)
        description(blank: true, maxSize: 511)
    }
}
