package com.EPRSystem.demo.entity;

import com.EPRSystem.demo.dto.AddressDto;
import com.EPRSystem.demo.dto.ContactDto;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class AddressableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "addressableEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<AddressEntity> addressEntities;
    @OneToMany(mappedBy = "addressableEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<ContactEntity> contactEntities;



    public void setAddressEntitiesByDto( Set<AddressDto> addressDtoSet) {
        Set addressEntities = new HashSet();
        for (AddressDto addressDto:addressDtoSet
             ) {
            addressEntities.add(new AddressEntity(addressDto));
        }
        this.addressEntities = addressEntities;
    }

    public void setContactEntitiesByDto( Set<ContactDto> contactDtoSet){
        Set contactEntities = new HashSet();
        for (ContactDto contactDto:contactDtoSet
        ) {
            contactEntities.add(new ContactEntity(contactDto));
        }
        this.contactEntities = contactEntities;
    }

    public AddressableEntity() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<AddressEntity> getAddressEntities() {
        return addressEntities;
    }

    public void setAddressEntities(Set<AddressEntity> addressEntities) {
        this.addressEntities = addressEntities;
    }

    public Set<ContactEntity> getContactEntities() {
        return contactEntities;
    }

    public void setContactEntities(Set<ContactEntity> contactEntities) {
        this.contactEntities = contactEntities;
    }

}
