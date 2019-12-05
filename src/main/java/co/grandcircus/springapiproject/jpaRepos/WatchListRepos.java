package co.grandcircus.springapiproject.jpaRepos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.grandcircus.springapiproject.models.watchlist;

public interface WatchListRepos extends JpaRepository<watchlist, String> {
	
	@Query("select s from watchlist s where s.tmdbId = ?1")
	watchlist findByTmdbId(String id);

}
