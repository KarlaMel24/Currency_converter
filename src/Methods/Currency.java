package Methods;

public record Currency(
        String base_code,
        String target_code,
        int conversion_rate,
        int conversion_result,
        String time_last_update_utc
) {
}
