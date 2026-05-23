package com.huttger.joshua.story;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/story")
public class StoryStoreController {
	@Autowired
	private StoryRepository storyRepository;
	@PostMapping(path="/add")
	public @ResponseBody String addNewStory (@RequestParam String title
			, @RequestParam String contents) {
		Story n = new Story();
		n.setTitle(title);
		n.setContents(contents);
		storyRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Story> getAllStories() {
		return storyRepository.findAll();
	}
}
