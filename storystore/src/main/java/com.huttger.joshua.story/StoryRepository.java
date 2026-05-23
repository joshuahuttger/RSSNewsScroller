package com.huttger.joshua.story;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called storyRepository
// CRUD refers Create, Read, Update, Delete

public interface StoryRepository extends CrudRepository<Story, Integer> {

}
