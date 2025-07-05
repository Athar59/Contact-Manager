package com.contactmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.contactmanager.exception.ResourceNotFoundException; // ✅ ADD THIS!
import com.contactmanager.model.Contact;
import com.contactmanager.repository.ContactRepository;

import org.springframework.stereotype.Service; // ✅ Also add this if missing!

@Service // ✅ Also add this!
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    public Contact getContactById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Contact not found"));
    }

    public Contact addContact(Contact contact) {
        return repository.save(contact);
    }

    public Contact updateContact(Long id, Contact contact) {
        Contact existing = getContactById(id);
        existing.setName(contact.getName());
        existing.setEmail(contact.getEmail());
        existing.setPhone(contact.getPhone());
        return repository.save(existing);
    }

    public void deleteContact(Long id) {
        repository.deleteById(id);
    }

    public List<Contact> searchContacts(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}
