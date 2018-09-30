package springframework.guru.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService {
	
	private final ChuckNorrisQuotes chuckQuotes;

	public JokesServiceImpl() {
		this.chuckQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckQuotes.getRandomQuote();
	}

}
