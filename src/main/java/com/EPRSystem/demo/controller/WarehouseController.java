package com.EPRSystem.demo.controller;

import com.EPRSystem.demo.dto.ResponseWrapper;
import com.EPRSystem.demo.dto.WarehouseDto;
import com.EPRSystem.demo.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;


    @GetMapping("")
    public ResponseWrapper getWarehouse() {
        try {
            return new ResponseWrapper(200, warehouseService.getAll());
        } catch (Exception e) {
            return new ResponseWrapper(400, e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseWrapper getByID(@PathVariable(value = "id") long id) {
        try {
            return new ResponseWrapper(200, warehouseService.getById(id));
        } catch (Exception e) {
            return new ResponseWrapper(400, e.getMessage());
        }
    }

    @PostMapping("")
    public ResponseWrapper addWarehouse(@RequestBody WarehouseDto warehouseDto) {
        try {
            return new ResponseWrapper(200, warehouseService.add(warehouseDto));
        } catch (Exception e) {
            return new ResponseWrapper(400, e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseWrapper updateWarehouse(@RequestBody WarehouseDto warehouseDto, @PathVariable(value = "id") long id) {
        try {
            return new ResponseWrapper(200, warehouseService.update(warehouseDto, id));
        } catch (Exception e) {
            return new ResponseWrapper(400, e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseWrapper deleteWarehouse(@PathVariable(value = "id") long id) {
        try {
            return new ResponseWrapper(200, warehouseService.delete(id));
        } catch (Exception e) {
            return new ResponseWrapper(400, e.getMessage());
        }
    }


}
