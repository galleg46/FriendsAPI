package com.friends.friendsapi.service;

import com.friends.friendsapi.models.Friend;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class FriendService {

    private List<Friend> friendList;

    public FriendService() {
        friendList = new ArrayList<>();

        Friend friend = new Friend(1, "Klara", "Schaibly", "Editor");
        Friend friend1 = new Friend(2, "Juliana", "Rattin", "Graphic Designer");
        Friend friend2 = new Friend(3, "Danny", "Pantoja", "Salesman");
        Friend friend3 = new Friend(4, "Ross", "Bravo", "Software Engineer");
        Friend friend4 = new Friend(5, "Alex", "Hernandez-Sotelo", "Data Analyst");

        friendList.addAll(Arrays.asList(friend,friend1,friend2,friend3,friend4));
    }

    public Optional<Friend> getFriend(Integer id) {
        Optional<Friend> optional = Optional.empty();

        for (Friend friend : friendList) {
            if (id == friend.getId()){
                optional = Optional.of(friend);
                return optional;
            }
        }

        return optional;
    }
}
