package com.shichko.library.service.implementations;

import com.shichko.library.entity.Reader;
import com.shichko.library.repository.ReaderRepository;
import com.shichko.library.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ReaderService extends AbstractService<Reader, ReaderRepository> implements UserDetailsService {

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    public ReaderService(ReaderRepository readerRepository) {
        super(readerRepository);
    }

    @Override
    public void addNew(Reader reader) {
        reader.setPassword(bCryptPasswordEncoder.encode(reader.getPassword()));
        super.addNew(reader);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Reader reader = repository.findByEmail(s);
        if(reader == null) {
            throw new UsernameNotFoundException("reader not found");
        }
        return reader;

    }
}