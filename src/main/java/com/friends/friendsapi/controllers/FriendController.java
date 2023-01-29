package com.friends.friendsapi.controllers;

import com.friends.friendsapi.models.Friend;
import com.friends.friendsapi.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class FriendController {

    private FriendService friendService;

    @Autowired
    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @GetMapping("/friend/{id}")
    public Friend getFriend(@PathVariable int id) {
        Optional<Friend> friend = friendService.getFriend(id);

        return friend.orElse(null);
    }
}
