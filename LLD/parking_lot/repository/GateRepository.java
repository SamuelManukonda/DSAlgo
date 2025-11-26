package LLD.parking_lot.repository;

import LLD.parking_lot.exception.GateNotFoundException;
import LLD.parking_lot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {

    Map<Integer, Gate> gateMap = new HashMap<>();

    public Gate findByGateId(int gateId) throws GateNotFoundException {
        if(!gateMap.containsKey(gateId)){
           throw new GateNotFoundException();
        }
        return gateMap.get(gateId);
    }


}
