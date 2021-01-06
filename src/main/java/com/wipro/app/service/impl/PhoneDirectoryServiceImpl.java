package com.wipro.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.wipro.app.exception.RecordNotfoundException;
import com.wipro.app.service.PhoneDirectoryService;
import com.wipro.app.vo.PhoneDirectory;

@Service
public class PhoneDirectoryServiceImpl implements PhoneDirectoryService{
	
	private static Logger LOGGER = LoggerFactory.getLogger(PhoneDirectoryServiceImpl.class);

	@Override
	public String getPalindrome(String input) {
	    input = input.toLowerCase();
		String longest = input.substring(0, 1);
		for (int i = 0; i < input.length(); i++) {
			String tmp = checkForEquality(input, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}

			tmp = checkForEquality(input, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}
		LOGGER.info("Palindrome output {}",longest);
	    return longest;
	}
	private String checkForEquality(String input, int begin, int end) {
		while (begin >= 0 && end <= input.length() - 1 && input.charAt(begin) == input.charAt(end)) {
			begin--;
			end++;
		}
		return input.substring(begin + 1, end);
	}
	
	@Override
	public List<String> getPhoneDirectoryName(final String name) {
		List<PhoneDirectory> phoneDirectoryList = new ArrayList<>();
		phoneDirectoryList.add(new PhoneDirectory("Kumar", "9591325869"));
		phoneDirectoryList.add(new PhoneDirectory("Rajkumar", "9591324869"));
		phoneDirectoryList.add(new PhoneDirectory("Vijay", "9591325369"));
		phoneDirectoryList.add(new PhoneDirectory("Kannan", "9591345869"));
		phoneDirectoryList.add(new PhoneDirectory("Arun", "9591325569"));
		phoneDirectoryList.add(new PhoneDirectory("Ajay", "9591328869"));
		phoneDirectoryList.add(new PhoneDirectory("kamal", "9591322869"));
		
		List<String> list = query(name, phoneDirectoryList);
		if(CollectionUtils.isEmpty(list))
			throw new RecordNotfoundException(name+" | Record not found");
		list.forEach(System.out::println);
		return list;
	}
	
	private List<String> query(String queryStr, List<PhoneDirectory> list) {
        List<String> suggestion = new ArrayList<>();
        list.forEach(std -> {
            if (isMatched(queryStr, String.valueOf(std.getName()))) {
                suggestion.add(String.valueOf(std.getName()));
            }
        });
        return suggestion;
    }

    private static boolean isMatched(String query, String text) {
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			for (int j = 0; j < query.length(); j++) {
				char check = query.charAt(j);
				if (c == check) {
					return true;
				}
			}
		}
		return false;
    }
	
	

}
