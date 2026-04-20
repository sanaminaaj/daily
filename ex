@FeignClient("RATING-SERVICE")
public interface RatingService{
	@GetMapping("/rating/{id}")
	List<Rating> getRatings(@PathVariable String id);
}
