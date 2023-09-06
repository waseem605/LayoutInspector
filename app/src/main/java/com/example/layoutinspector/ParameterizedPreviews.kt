package com.example.layoutinspector

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun CustomListItemRowItem(
    @PreviewParameter(ModelConfigProvider::class)item: PlayerModel) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(4.dp),
        elevation = 4.dp) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = item.img),
                    contentDescription = null, // Provide a content description if needed
                    modifier = Modifier
                        .weight(0.25f)
                        .height(50.dp),
                    contentScale = ContentScale.Inside
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column(
                    modifier = Modifier.weight(0.75f)
                ) {
                    Text(text = item.name, style = TextStyle(fontWeight = FontWeight.Bold))
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Experience :" + item.experience,
                modifier = Modifier.padding(top = 4.dp),
                style = TextStyle(fontSize = 12.sp)
            )
            Text(
                text = "Age :" + item.age,
                modifier = Modifier.padding(top = 4.dp),
                style = TextStyle(fontSize = 12.sp)
            )
            Text(
                text = "Weight: ${item.weight} ",
                modifier = Modifier.padding(top = 4.dp),
                style = TextStyle(fontSize = 12.sp)
            )
        }

    }
}
class ModelConfigProvider : PreviewParameterProvider<PlayerModel> {
    override val values: Sequence<PlayerModel> = sequenceOf(
        PlayerModel(
            1,
            "MALIK BEASLEY",
            R.drawable.img,
            "1.93m",
            "26 years",
            "187lb (85kg)",
            "7 Years",
            "The son of Michael and Deena Beasley… Family is very important to Malik… Education and receiving his degree from Florida State was very important to Malik and his parents… His father played professional basketball in Chili, the Dominican Republic and Puerto Rico before Malik was born… Grandfather, father and mother are all actors… Chose Florida State over Maryland, St. John’s, UCLA, UConn, VCU, Oregon, Wake Forest and Georgia… As a junior in high school, averaged 19.1 points, 8.3 rebounds, 2.4 assists and 2.1 steals in leading St. Francis to the state"
        ),
        PlayerModel(
            4,
            "GIANNIS ANTETOKOUNMPO",
            R.drawable.img_4,
            "2.13m",
            "28 years",
            "243lb (110kg)",
            "10 Years",
            "2019 FIBA World Cup: Averaged 14.8 points, 8.8 rebounds and 2.4 assists in 5 games, leading Greece to the Second Round ... shot 52.5% from the field ... 2016 Olympic Qualifying: In 3 Olympic Qualifying games for Greece he averaged 15.3 points, 5.7 rebounds, 2.0 assists and a tournament-high 2.0 blocks per game ... 2014 FIBA World Cup: Averaged 6.3 points, 4.3 rebounds and 0.3 assists in 16.0 minutes for his native Greece ... posted highs of 15 points against Puerto Rico, and 6 rebounds against the Philippines and Argentina ... 2013 U20 European Championships: Played in 10 games for Greece’s U20 National Team and averaged 8.0 points, 7.6 rebounds and 2.2 assists ... ranked second for the tournament in defensive rebounds (7.0) and 7th in blocked shots (1.4) ... Greece finished the tournament in fifth place with an 8-2 record ... 2012-13: Played in 26 games for Filathlitikos AO (A2, second division) and averaged 9.5 points, 5.0 rebounds and 1.4 assists ... shot 62.1% from 2-point field goal range ... selected to play in the Greek League All-Star Game and scored 8 points ... grabbed a season-high 10 rebounds vs. GS Laviro on 2/23 ... posted a career-high 23 points vs. Irakleuo Crete on 3/2 ... had 13 points, 7 rebounds and a season-high 4 blocks vs. Ermis Lagkada on 4/13."
        )
    )
}

