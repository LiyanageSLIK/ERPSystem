package com.EPRSystem.demo.service;

import com.EPRSystem.demo.dto.WarehouseDto;
import com.EPRSystem.demo.entity.WarehouseEntity;
import com.EPRSystem.demo.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;


    public List<WarehouseDto> getAll() throws Exception{
        ArrayList<WarehouseDto> warehouseDtoList = new ArrayList<>();
        List<WarehouseEntity> warehouseEntityList =warehouseRepository.findAll();
//        if(warehouseEntityList.get(0).getName().isEmpty()){
//            throw new Exception("No Warehouse records");
//        }
        for (WarehouseEntity warehouseEntity1 : warehouseEntityList) {
            WarehouseDto warehouseDto=new WarehouseDto(warehouseEntity1);
            warehouseDtoList.add(warehouseDto);
        }
        return warehouseDtoList;
    }

    public WarehouseDto getById(long id) throws Exception {
        if (warehouseRepository.existsById(id)) {
            return new WarehouseDto(warehouseRepository.getById(id));
        } else {
            throw new Exception("Warehouse not exists for ID:" + id);
        }
    }

    public WarehouseDto add(WarehouseDto warehouseDto) throws Exception {
        if (warehouseDto.isValidDto(0)) {
            WarehouseEntity warehouseEntity=new WarehouseEntity(warehouseDto);
            return new WarehouseDto(warehouseRepository.save(warehouseEntity));
        } else {
            throw new Exception("Missing some properties for given Warehouse");
        }
    }

    public WarehouseDto update(WarehouseDto warehouseDto, long id) throws Exception {
        if (!warehouseDto.isValidDto(id)) {
            throw new Exception("Missing some properties for given Warehouse");
        }
        if (!warehouseRepository.existsById(id)) {
            throw new Exception("Warehouse not exists for ID:" + id);
        }
        WarehouseEntity warehouseEntity= new WarehouseEntity(warehouseDto);
        warehouseEntity.setId(id);
        return new WarehouseDto(warehouseRepository.save(warehouseEntity));
    }

    public WarehouseDto delete(long id) throws Exception {
        if (warehouseRepository.existsById(id)) {
            WarehouseEntity warehouseEntity=(warehouseRepository.getById(id));
//            warehouseRepository.deleteById(id);
            return new WarehouseDto(warehouseEntity);
        } else {
            throw new Exception("Warehouse not exists for ID:" + id);
        }
    }
}
