package com.soap.ws;

import java.util.Date;
import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

  @WebMethod(operationName = "conversionEuroToDh")
  public double conversionEuroToDh(@WebParam(name = "montant") double montant) {
    return montant * 11;
  }

  @WebMethod(operationName = "getCompte")
  public Compte getCompte(@WebParam(name = "code") int code) {
    return new Compte(code, Math.random() * 9000, new Date());
  }

  @WebMethod(operationName = "getComptes")
  public List<Compte> getComptes() {
    return List.of(new Compte(1, Math.random() * 9000, new Date()),
        new Compte(2, Math.random() * 9000, new Date()));
  }

}
