package com.example.Myapi.Controller;

import com.example.Myapi.Entity.Server;
import com.example.Myapi.Repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servers")
public class ServerController {
    @Autowired
    private ServerRepository serverRepository;

    @GetMapping
    public ResponseEntity<List<Server>> getAllServers() {
        List<Server> servers = serverRepository.findAll();
        return new ResponseEntity<>(servers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Server> getServerById(@PathVariable String id) {
        Optional<Server> server = serverRepository.findById(id);
        return server.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping
    public ResponseEntity<Server> createServer(@RequestBody Server server) {
        Server savedServer = serverRepository.save(server);
        return new ResponseEntity<>(savedServer, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServer(@PathVariable String id) {
        serverRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Server>> searchServersByName(@RequestParam String name) {
        List<Server> servers = serverRepository.findByNameContaining(name);
        if (servers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servers, HttpStatus.OK);
    }
    //end
}

