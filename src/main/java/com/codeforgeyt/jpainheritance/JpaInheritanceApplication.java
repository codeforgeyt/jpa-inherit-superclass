package com.codeforgeyt.jpainheritance;

import com.codeforgeyt.jpainheritance.model.Tank;
import com.codeforgeyt.jpainheritance.model.Truck;
import com.codeforgeyt.jpainheritance.model.Vehicle;
import com.codeforgeyt.jpainheritance.repository.TankRepository;
import com.codeforgeyt.jpainheritance.repository.TruckRepository;
import com.codeforgeyt.jpainheritance.repository.VehicleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaInheritanceApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(JpaInheritanceApplication.class, args);
        VehicleRepository tankRepository = configurableApplicationContext.getBean(TankRepository.class);
        VehicleRepository truckRepository = configurableApplicationContext.getBean(TruckRepository.class);

        Tank myTank = new Tank("T-150", 5, 500);
        Truck myTruck = new Truck("200M", 2, 36, true);

        tankRepository.save(myTank);
        truckRepository.save(myTruck);

//        tankRepository.delete(myTank);
//        truckRepository.delete(myTruck);
    }


}
