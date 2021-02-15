package br.com.votti.study.groovy.classes

@groovy.transform.ToString
class Tweet {

    String username
    String text
    Integer retweets
    Integer favorites
    Date createOn

    Tweet(String username, String tweet) {
        this.username = username
        text = tweet
        retweets = 0
        favorites = 0
        createOn = new Date()
    }

    void addToRetweet(){
        retweets += 1
    }

    void addToFavorite(){
        favorites += 1
    }
}

