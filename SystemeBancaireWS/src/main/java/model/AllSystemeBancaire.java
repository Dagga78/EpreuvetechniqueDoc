/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author jerom
 */
public class AllSystemeBancaire implements Serializable{
    Map<String,SystemeBancaire> map;

    public AllSystemeBancaire(Map<String,SystemeBancaire> pMap) {
        this.map = pMap;
    }

    public Map<String, SystemeBancaire> getMap() {
        return map;
    }
}