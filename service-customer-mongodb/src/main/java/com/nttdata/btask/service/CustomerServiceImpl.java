package com.nttdata.btask.service;

import com.nttdata.btask.interfaces.CustomerService;
import com.nttdata.domain.contract.CustomerRepository;
import com.nttdata.domain.models.CustomerDto;
import com.nttdata.infraestructure.documents.Customer;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerServiceImpl implements CustomerService {
  private final CustomerRepository customerRepository;

  public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Override
  public Multi<CustomerDto> list() {
    return customerRepository.list();
  }

  @Override
  public Uni<CustomerDto> addCustomer(CustomerDto customerDto) {
    return customerRepository.addCustomer(customerDto);
  }

  @Override
  public Uni<CustomerDto> findByNroDocument(CustomerDto customerDto) {
    return customerRepository.findByNroDocument(customerDto);
  }

  @Override
  public Uni<CustomerDto> updateCustomer(CustomerDto customerDto) {
    return customerRepository.updateCustomer(customerDto);
  }

  @Override
  public Uni<CustomerDto> deleteCustomer(CustomerDto customerDto) {
    return customerRepository.deleteCustomer(customerDto);
  }


}
