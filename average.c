#include <stdio.h>
#include <math.h>

int main(void) {
    struct statistics {
        int x;
        int y;
    };
    int i, n;
	float total_x, total_y;
    float average_x, average_y;
	float var_x, var_y;
    float variance_x, variance_y;
    float sd_x, sd_y;
    float cov, covariance;
    float cc;
    float slope, intercept;

    printf("データの個数を入力してください\n");
    scanf("%d", &n);
    struct statistics data[n];

    printf("データ(x, y)を入力してください\n");
    for(i=0; i<n; i++) {
        scanf("%d", &data[i].x);
        scanf("%d", &data[i].y);
    }

    //平均
	for(i = 0; i < n; i++){
	    total_x += data[i].x;
	    total_y += data[i].y;
	}
    average_x = total_x / n;
    average_y = total_y / n;
	printf("xの平均=%.3f, yの平均=%.3f\n",average_x, average_y);

    //分散・標準偏差
    for(i = 0; i < n; i++) {
        var_x += pow((data[i].x - average_x), 2);
        var_y += pow((data[i].y - average_y), 2);
    }
    variance_x = var_x / n;
    sd_x = sqrt(variance_x);
    variance_y = var_y / n;
    sd_y = sqrt(variance_y);
	printf("xの分散=%.3f, xの標準偏差=%.3f\n",variance_x, sd_x);
	printf("yの分散=%.3f, yの標準偏差=%.3f\n",variance_y, sd_y);

    //共分散
    for(i = 0; i < n; i++) {
        cov += (data[i].x - average_x) * (data[i].y - average_y);
    }
    covariance = cov / n;
    printf("共分散=%.3f\n", covariance);

    //相関係数
    cc = covariance / (sd_x * sd_y);
    printf("相関係数=%.3f\n", cc);

    //回帰直線
    slope = covariance / variance_x;
    intercept = average_y - slope * average_x;
    printf("回帰直線の傾き=%.3f, 切片=%.3f\n",slope, intercept);

    return 0;
}
