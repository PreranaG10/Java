class Netflix{
static String top10Movies[] = {"Gangs of Godavari", "Lapata ladies", "article370", "Shaitaan", "Crew", "safe house", "Bade Miyan Chote Miya", "under Paris", "focus", "spider-man"};
static String hindiMovies[] = {"Dunki", "jawan", "OMG", "Darlings", "GanguBai", "shehazada", "khufiya", "GumRaah", "Bhakshak", "Mimi", "83", "mili", "Hit", "Bulbul", "Major", "Jersey", "Queen", "Ok Jaanu", "Dhak Dhak", "Talaash", "Sanju", "Om shanti om", "Malang", "Malaal", "Raees"};
static String englishSeries[] = {"Bridgerton", "Money Heist", "my demon", "vampire dairy", "king land", "Hidden Love", "never Have i Ever", "She", "Friends", "suits", "Lucifer", "anyone but you", "love at first sight", 
"Beast", "johhny english", "the english patient", "purple hearts", "NowHere", "Red Notice", "under paris", "man vs bee", "Bad boys", "After everything", "no hard feelings", "the notebook"};
static String koreanSeries[] = {"hierarchy", "queen of tears", "destined with you", "my demon", "crash course", "Hidden love", "frankly speaking", "a time called you", "true beauty", "crash landing on you",
 "see you in next life", "celebrity", "behind your touch", "first love", "mask girl", "little women", "castway diva", "my holo love", "doctor chaa", "the glory"};
 public static void main(String args[]){
 System.out.println("The available top10Movies are:" + top10Movies.length);
for (int index = 0 ;   index <= top10Movies.length -1 ;   index++  ){
System.out.println(top10Movies[index]);
}
System.out.println("The available hindiMovies are:" + hindiMovies.length);
for (int index = 0 ;   index <= hindiMovies.length -1 ;   index++  ){
System.out.println(hindiMovies[index]);
}
System.out.println("The available englishSeries are:" + englishSeries.length);
for (int index = 0 ;   index <= englishSeries.length -1 ;   index++  ){
System.out.println(englishSeries[index]);
}
System.out.println("The available koreanSeries are:" + koreanSeries.length);
for(int index=0; index<= koreanSeries.length-1; index++){
System.out.println(koreanSeries[index]);
}
}
}