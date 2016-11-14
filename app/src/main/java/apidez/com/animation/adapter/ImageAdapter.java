package apidez.com.animation.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apidez.com.animation.R;
import apidez.com.animation.databinding.ItemImageBinding;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by nongdenchet on 11/14/16.
 */

public class ImageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private String[] images = new String[]{
            "http://images.media-allrecipes.com/images/50717.jpg",
            "https://i.ytimg.com/vi/u1w7zqbBiXM/maxresdefault.jpg",
            "http://www.bonappetit.com/wp-content/uploads/2013/08/grilled-ratatouille-salad-646.jpeg",
            "http://app.cookingmatters.org/sites/default/files/sos-img/Ratatouille.jpg",
            "http://www.seriouseats.com/recipes/assets_c/2013/09/20130922-266596-sunday-brunch-ratatouille-fried-eggs-thumb-625xauto-352893.jpg",
            "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSaSi9cqP-Ri9rCsLQQtOTkcQ9RVhJ-B8E--nehLWcR7MYZMfrR",
            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRy3SItnS5jMVbsDWQix5sbvh25mbdJ6QjW8l-eNOHSPP1QqOtP",
            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTf4tLgsCSTKFW_M8okYxh7YbDzp1cbTBx6h5N7FpQe5JPfLY0saA",
            "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcS4povIEXYYbENYsG-A-7mRQ5GYJlR6wmQwPHCThQHEjYrLh1caRg",
            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTVC2146zTHrTSqmuRqvQjT18a58PoMIqdOUc8zI9Nf_4oJzDBU"
    };

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_image, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).bind(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemImageBinding binding;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            binding = DataBindingUtil.bind(itemView);
        }

        public void bind(String url) {
            binding.setUrl(url);
        }

        @OnClick(R.id.image)
        public void onItemClick() {
            // TODO: implement
        }
    }
}
