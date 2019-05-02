package com.example.crack_jack.movielistingapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {


    private List<MovieModel> movieModels = new ArrayList<>();
    private Activity mActivity;



    public MovieAdapter(Context mContext, ArrayList<MovieModel> movieModels) {
        this.movieModels = movieModels;
    }

    MovieAdapter(Activity mActivity) {
        this.mActivity = mActivity;
    }
    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new MovieViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MovieViewHolder holder, final int position) {

        final MovieModel movieModel = movieModels.get(position);
        holder.bindTo(movieModel);


        holder.content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Clicked this Element" , Snackbar.LENGTH_SHORT).show();

                Intent i = new Intent(mActivity,Content.class);
            }
        });

}
//    public void remove (MovieModel item){
//        int position = movieModels.indexOf(item);
//        movieModels.remove(position);
//        notifyItemRemoved(position);
//    }



    @Override
    public int getItemCount() {
        return movieModels.size();
    }

    public void addMovieItem(MovieModel item) {
        movieModels.add(item);
        notifyItemInserted(movieModels.size());
    }


    public class MovieViewHolder extends RecyclerView.ViewHolder implements com.example.crack_jack.movielistingapp.MovieViewHolder {

        private TextView movie_id, movieName, releaseDate, movieRating;
        private ImageView movieImage;
        public CardView content;

        MovieViewHolder(View itemView) {
            super(itemView);

            movieImage = itemView.findViewById(R.id.imageView);

            movieName = itemView.findViewById(R.id.movie_title);
            movieRating = itemView.findViewById(R.id.movie_rating);
            releaseDate = itemView.findViewById(R.id.movie_release);
            movie_id = itemView.findViewById(R.id.movie_id);
            content = (CardView) itemView.findViewById(R.id.content);

        }

        public void bindTo(MovieModel movieModel) {

            movieName.setText(movieModel.movieName);
            movieRating.setText("Rating : " + movieModel.rating);
            releaseDate.setText(movieModel.releaseDate);
            movie_id.setText(movieModel.movieId);

            Glide.with(super.itemView).load(movieModel.ImageURI).into(movieImage);

        }

//        @OnClick(R.id.itemMovie)
//        public void itemMovie(){
//            Intent i = new Intent(mActivity, Apaan.class);
//            mActivity.startActivity(i);
//
//        }


//        @Override
//        public void onClick(View view) {
        // TODO Auto-generated method stub
//            Intent intent=new Intent(view.getContext(),ChartImageActivity.class);
//            intent.putExtra("chartLink", ChartLink);
//            startActivity(intent);
//        }

    }
}
