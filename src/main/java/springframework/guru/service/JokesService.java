package springframework.guru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesService extends ChuckNorrisQuotes {
	
	@Autowired
	private ChuckNorrisQuotes chuckQuotes;
	

	public String getChuckNorrisString() {
		
		return chuckQuotes.getRandomQuote();
	}

}
