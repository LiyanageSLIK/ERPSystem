package com.EPRSystem.demo.entity;

import com.EPRSystem.demo.dto.AddressDto;
import com.EPRSystem.demo.dto.ContactDto;
import org.hibernate.collection.internal.PersistentSet;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "addressable")
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class AddressableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "addressableEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<AddressEntity> addressEntities;
    @OneToMany(mappedBy = "addressableEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<ContactEntity> contactEntities;



    public void setAddressEntitiesByDto(@NotNull Set<AddressDto> addressDtoSet) {
        PersistentSet addressEntities = new PersistentSet();
        for (AddressDto addressDto:addressDtoSet
             ) {
            addressEntities.add(new AddressEntity(addressDto));
        }
        this.addressEntities = addressEntities;
    }

    public void setContactEntitiesByDto(@NotNull Set<ContactDto> contactDtoSet){
        PersistentSet contactEntities = new PersistentSet();
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
