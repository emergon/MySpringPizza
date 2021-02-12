/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.service;

import emergon.entity.Sizes;
import emergon.repo.SizesRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SizeServiceImpl implements SizeService {

    @Autowired
    SizesRepo sizesRepo;
    
    @Override
    public List<Sizes> findAll() {
        return sizesRepo.findAll();
    }

    @Override
    public Sizes findById(int id) {
        return sizesRepo.findById(id);
    }
    
}
