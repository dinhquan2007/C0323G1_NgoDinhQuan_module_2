package case_study.repository.impl;

import case_study.model.facility.Facility;
import case_study.model.facility.Vila;
import case_study.repository.IFacilityRepository;

import java.util.List;

public class FacilityRepository implements IFacilityRepository {

    @Override
    public List<Facility> getAll() {
        return null;
    }

    @Override
    public void add(Facility facility) {
        if(facility instanceof Vila){

        }
    }
}
