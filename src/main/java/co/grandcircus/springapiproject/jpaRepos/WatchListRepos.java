package co.grandcircus.springapiproject.jpaRepos;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.springapiproject.models.watchlist;

public interface WatchListRepos extends JpaRepository<watchlist, String> {

}