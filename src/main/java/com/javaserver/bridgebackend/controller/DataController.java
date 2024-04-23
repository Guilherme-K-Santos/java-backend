package com.javaserver.bridgebackend.controller;

import com.javaserver.bridgebackend.entity.Data;
import com.javaserver.bridgebackend.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/challenge")
public class DataController {

    @Autowired
    private DataRepository repository;

    @GetMapping
    public List<Data> getAll() {
        List<Data> allData = repository.findAll();
        return allData;
    }

    @PostMapping
    public Data insert(@RequestBody Data data) {
        long startTime = System.currentTimeMillis();
        int result = primeNumbersCalc(data.getNumber());
        long endTime = System.currentTimeMillis();
        int durationInSeconds = (int) ((endTime - startTime) / 1000);

        data.setResponse(result);
        data.setSeconds(durationInSeconds);

        Data response = repository.save(data);
        return response;
    }

    public int primeNumbersCalc(int limit) {
        List<Integer> primes = new ArrayList<>();
        boolean[] marcador = new boolean[(limit + 1)];
        int count = 0;

        for (int i = 2; i < limit; i++) {
            marcador[i] = true;
        }
        marcador[0] = false; // 0 não é primo
        marcador[1] = false; // 1 não é primo

        for (int num = 2; num < limit; num++) {
            if (marcador[num]) {
                primes.add(num); // salva lista de primos já vistos para próxima vez.
                count++;
                // Marca todos os múltiplos de num como não primos
                for (int multiple = num + num; multiple < limit; multiple += num) {
                    marcador[multiple] = false;
                }
            }
        }

        return count;
    }
}
